# AI Mode Conversion Operation Guide

#### 1 Confirm that OpenVINO is installed

#### 2 Configure Model Optimizer

2.1 Configure all frameworks

```shell
cd /opt/intel/openvino/deployment_tools/model_optimizer/install_prerequisites
```

Note: /opt/intel/openvino is the default path for installing openvino. If you use a customized path when installing openvino, please replace it with <INSTALL_DIR>

```shell
install_prerequisites.sh
```

2.2 Configure specific framework

Caffe：

```shell
install_prerequisites_caffe.sh
```

TensorFlow：

```shell
install_prerequisites_caffe.sh
```

MXNet：

```shell
install_prerequisites_mxnet.sh
```

Kaldi：

```shell
install_prerequisites_kaldi.sh
```

ONNX：

```shell
install_prerequisites_onnx.sh
```

#### 3 Enable Model Optimizer for conversion

```shell
cd /opt/intel/openvino/deployment_tools/model_optimizer
python3 mo.py --input_model INPUT_MODEL
```

For example:

```shell
python3 mo.py --input_model /home/quxinghe/Downloads/VGG_coco_SSD_300x300_iter_400000.caffemodel
```

Note: Take the conversion of Caffe model as an example. If the files name of .prototxt and .caffemodel are different or placed in different directories, you need to specify the path of .prototxt

```shell
python3 mo.py --input_model /home/quxinghe/Downloads/VGG_coco_SSD_300x300_iter_400000.caffemodel --input_proto /home/quxinghe/Downloads/deploy.prototxt
```

