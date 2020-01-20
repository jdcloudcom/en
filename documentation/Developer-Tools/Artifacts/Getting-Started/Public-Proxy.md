# Public Agent Repository

## List of Agent Repository

JD Cloud artifact repository provides the proxy function to the maven public repository and the repository list can be viewed on the public agent repository page.


## Configuration Guide

### maven Configuration Guide

Add the mirror node in the configuration file settings.xml of maven, as follows:

```
<mirror>
    <id>jdrepomaven</id>
    <mirrorOf>*</mirrorOf>
    <name>jdcloud-proxy</name>
    <url>https://maven.jdcloud.com/repos/content/groups/public/</url>
</mirror>

```
You can continue to add other agent repositories in the repository node, taking gradle-plugin for example:

```
<repository>
    <id>gradle-plugin</id>
    <url>https:///maven.jdcloud.com/repos/content/repositories/gradle-plugin/</url>
    <releases>
        <enabled>true</enabled>
    </releases>
    <snapshots>
        <enabled>true</enabled>
    </snapshots>
</repository>

```

### gradle Configuration Guide
Add the following codes in build.gradle:

```
allprojects {
    repositories {
        maven { url 'https://maven.jdcloud.com/repos/content/groups/public/' }
        mavenLocal()
        mavenCentral()
    }
}
```

You can continue to add other agent repositories, taking gradle-plugin for example:
```
allProjects {
    repositories {
        maven { url 'https://maven.jdcloud.com/repos/content/groups/public/' }
        maven { url 'https://maven.jdcloud.com/repos/content/repositories/gradle-plugin/'}
        mavenLocal()
        mavenCentral()
    }
}
```

