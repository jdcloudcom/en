## Access via Native Java API

Native Java API is the most common and high-efficient access mode. For usage, please refer to

HbaseUtil.java
```
package com.jd.common;

import org.apache.hadoop.conf.Configuration;
import org.apache.hadoop.hbase.*;
import org.apache.hadoop.hbase.client.*;
import org.apache.hadoop.hbase.util.Bytes;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HbaseUtil {
    /**
     * Acquire configuration
     * @return
     */
    public static Configuration getConfiguration() {
        Configuration conf = null;
        try {
            conf = HBaseConfiguration.create();
            conf.set("hbase.zookeeper.quorum", "116.196.81.217");
            conf.set("hbase.zookeeper.property.clientPort", "2181");
            // We can also read the config from files below
            // configuration.addResource(new Path("/etc/hbase/conf/hbase-site.xml"));
            // configuration.addResource(new Path("/etc/hadoop/conf/core-site.xml"));
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conf;
    }

    /**
     * Create connection
     * @param conf
     * @return
     */
    public static Connection getConnection(Configuration conf)
    {
        //Create Connection and get Admin hold off
        Connection conn = null;
        try {
            conn = ConnectionFactory.createConnection(conf);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * Acquire admin
     * @param conn
     * @return
     */
    public static Admin getAdmin(Connection conn)
    {
        Admin admin = null;
        try {
            admin = conn.getAdmin();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return admin;
    }

    /**
     * Disable connection
     * @param conn
     * @param admin
     */
    public static void close(Connection conn, Admin admin)
    {
        try {
            if (admin != null) {
                admin.close();
            }
            if (conn != null && !conn.isClosed()) {
                conn.close();
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    /**
     * Create NameSpace
     * @param nameSpace
     */
    public static void createNameSpace(String nameSpace)
    {
        System.out.println("Creating Namespace : "+ nameSpace);
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            NamespaceDescriptor nsd = NamespaceDescriptor.create(nameSpace).build();
            admin.createNamespace(nsd);
            System.out.println("Namespace Created : "+ nameSpace);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * NameSpace List
     */
    public static void listNameSpace()
    {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            NamespaceDescriptor[] nameSpaceList = admin.listNamespaceDescriptors();
            System.out.println("List of Namespace available in the HBase");
            System.out.println("___________________________________________");
            for(NamespaceDescriptor nameSpace : nameSpaceList)
            {
                System.out.println(nameSpace);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Create table
     * @param tableName
     * @param cols
     */
    public static void createTable(String tableName, String[] cols)
    {
        System.out.println("Creating Table : "+ tableName);
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            TableName tName = TableName.valueOf(tableName);
            if (admin.tableExists(tName)) {
                System.out.println(tableName + " exists.");
            } else {
                HTableDescriptor hTableDesc = new HTableDescriptor(tName);
                for (String col : cols) {
                    HColumnDescriptor hColumnDesc = new HColumnDescriptor(col);
                    hTableDesc.addFamily(hColumnDesc);
                }
                admin.createTable(hTableDesc);
            }
            System.out.println("Table Created : "+ tableName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Delete table
     * @param tableName
     */
    public static void deleteTable(String tableName)
    {
        System.out.println("Delete Table : "+ tableName);
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            TableName tName = TableName.valueOf(tableName);
            if (admin.tableExists(tName)) {
                admin.disableTable(tName);
                admin.deleteTable(tName);
            } else {
                System.out.println(tableName + " not exists.");
            }
            System.out.println("Table Deleted : "+ tableName);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * List all the tables
     */
    public static void listTables()
    {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            TableName[] tableList = admin.listTableNames();
            System.out.println("List of Tables available in the HBase");
            System.out.println("___________________________________________");
            for(TableName table : tableList)
            {
                System.out.println(table);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Delete data
     * @param tableName
     * @param rowKey
     * @param colFamily
     * @param col
     */
    public static void delete(String tableName, String rowKey, String colFamily, String col)
    {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        // Instantiating HTable class
        try {
            Table table = conn.getTable(TableName.valueOf(tableName));
            Delete del = new Delete(Bytes.toBytes(rowKey));
            if (colFamily != null) {
                del.addFamily(Bytes.toBytes(colFamily));
            }
            if (colFamily != null && col != null) {
                del.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
            }
            /*
             * Delete in batches list<Delete> deleteList = new ArrayList<Delete>(); deleteList.add(delete); table.delete(deleteList);
             */
            table.delete(del);
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Delete data
     * @param tableName
     * @param rowKey
     */
    public static void delete(String tableName, String rowKey)
    {
        delete(tableName, rowKey, null, null);
    }

    /**
     * Delete in batches
     * @param tableName
     * @param rows
     */
    public static void delete(String tableName, String[] rows)
    {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        // Instantiating HTable class
        try {
            Table table = conn.getTable(TableName.valueOf(tableName));
            List<Delete> list = new ArrayList<Delete>();
            for (String row : rows) {
                Delete d = new Delete(row.getBytes());
                list.add(d);
            }
            if (list.size() > 0) {
                table.delete(list);
            }
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Write data
     * @param tableName
     * @param rowKey
     * @param colFamily
     * @param col
     * @param value
     */
    public static void put(String tableName, String rowKey, String colFamily, String col, String value)
    {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        // Instantiating HTable class
        try {
            Table table = conn.getTable(TableName.valueOf(tableName));
            Put put = new Put(Bytes.toBytes(rowKey));
            put.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col), Bytes.toBytes(value));
            table.put(put);

            /*
             * Insert in batches list<Put> putList = new ArrayList<Put>(); puts.add(put); table.put(putList);
             */
            // closing HTable
            table.close();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Write in batches
     * @param tableName
     * @param putList
     * @return
     */
    public static boolean put(String tableName, List<Put> putList) {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            Table table = conn.getTable(TableName.valueOf(tableName));
            table.put(putList);
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
        return true;
    }

    /**
     * Acquire data by RowKey
     * @param tableName Table Name
     * @param rowKey RowKey Name
     * @param colFamily Column Family Name
     * @param col Column Name
     * @throws IOException
     */
    public static void get(String tableName, String rowKey, String colFamily, String col) {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            Table table = conn.getTable(TableName.valueOf(tableName));
            Get get = new Get(Bytes.toBytes(rowKey));
            if (colFamily != null) {
                get.addFamily(Bytes.toBytes(colFamily));
            }
            if (colFamily != null && col != null) {
                get.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
            }
            Result result = table.get(get);
            showCell(result);
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Acquire data
     * @param tableName
     * @param rowKey
     * @param colFamily
     */
    public static void get(String tableName, String rowKey, String colFamily) {
        get(tableName, rowKey, colFamily, null);
    }

    /**
     * Acquire data
     * @param tableName
     * @param rowKey
     */
    public static void get(String tableName, String rowKey) {
        get(tableName, rowKey, null);
    }

    /**
     * Acquire in batches
     * @param tableName
     * @param rows
     */
    public static void get(String tableName, String[] rows) {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        Result[] results = null;
        try {
            Table table = conn.getTable(TableName.valueOf(tableName));
            List<Get> gets = new ArrayList<Get>();
            for (String row : rows) {
                if(row!=null){
                    gets.add(new Get(Bytes.toBytes(String.valueOf(row))));
                }else{
                    throw new RuntimeException("hbase have no data");
                }
            }
            if (gets.size() > 0) {
                results = table.get(gets);
            }
            for (Result result: results) {
                showCell(result);
            }
            table.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * Scan data
     * @param tableName
     * @param colFamily
     * @param cols
     */
    public static void scan(String tableName, String colFamily, String[] cols) {
        Configuration conf = getConfiguration();
        Connection conn = getConnection(conf);
        Admin admin = getAdmin(conn);
        try {
            // Instantiating HTable class
            Table table = conn.getTable(TableName.valueOf(tableName));
            Scan scan = new Scan();
            // Scanning the required columns
            if (colFamily != null) {
                scan.addFamily(Bytes.toBytes(colFamily));
            }
            if (colFamily != null && cols != null) {
                for (String col: cols) {
                    scan.addColumn(Bytes.toBytes(colFamily), Bytes.toBytes(col));
                }
            }

            // Getting the scan result
            ResultScanner scanner = table.getScanner(scan);

            // Reading values from scan result
            for (Result result = scanner.next(); result != null; result = scanner.next())
                showCell(result);
//                System.out.println("Found row : " + result);
            //closing the scanner
            scanner.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            close(conn, admin);
        }
    }

    /**
     * scan
     * @param tableName
     * @param colFamily
     */
    public static void scan(String tableName, String colFamily) {
        scan(tableName, colFamily, null);
    }

    /**
     * scan
     * @param tableName
     */
    public static void scan(String tableName) {
        scan(tableName, null);
    }
    /**
     * Formatting Output
     *
     * @param result
     */
    public static void showCell(Result result) {
        Cell[] cells = result.rawCells();
        for (Cell cell : cells) {
            System.out.println(new String(CellUtil.cloneRow(cell))
                    + " " + cell.getTimestamp()
                    + " " + new String(CellUtil.cloneFamily(cell))
                    + " " + new String(CellUtil.cloneQualifier(cell))
                    + " "+ new String(CellUtil.cloneValue(cell)));
        }
    }

    public static void main(String args[]){
        // Create table
        String cf[] = {"cf"};
        createTable("test5", cf);
        // List all the tables
        listTables();
        // Add data
        put("test5", "101", "cf", "name", "zhang3");
        put("test5", "101", "cf", "age", "18");
        put("test5", "102", "cf", "name", "li4");
        put("test5", "102", "cf", "age", "20");
        // Acquire data
        get("test5", "101", "cf", "name");
        get("test5", "101", "cf", "age");
//        System.out.println("-------------------------");
        // Delete data
//        delete("test5", "101", "cf","name");
//        get("test5", "101", "cf", "name");
//        System.out.println("-------------------------");
//        get("test5", "101", "cf", "age");
//        System.out.println("-------------------------");
        // Scan name column
//        String[] cols = {"name"};
//        scan("test5", "cf", cols);
//        System.out.println("-------------------------");
        // Scan name and age columns
//        String[] cols1 = {"name","age"};
//        scan("test5", "cf", cols1);
//        System.out.println("-------------------------");
        // Scan cf column family
//        scan("test5", "cf");
        System.out.println("-------------------------");
        // Scan the whole table
        scan("test5");
    }
}
```
