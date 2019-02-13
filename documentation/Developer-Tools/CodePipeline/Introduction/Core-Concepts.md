# Core Concepts
The following core concepts usually involve in understanding CodePipeline:

Concepts|Introduction
:---|:---
Stage| one CodePipeline can be divided into several Stages with each representing a group of relevant operations.
Action| Action is the most basic operation unit from adding manual approval to constructing a Docker Image, with the sequence from small to large. Each stage at least contain one operation, it is a certain task executing for project. Pipeline operations are executed in a way of particular order, in turn or in parallel, with the specific method to be determined in the configuration of the stage.

