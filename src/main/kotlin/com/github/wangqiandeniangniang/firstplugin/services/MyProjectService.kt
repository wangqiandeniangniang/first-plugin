package com.github.wangqiandeniangniang.firstplugin.services

import com.intellij.openapi.project.Project
import com.github.wangqiandeniangniang.firstplugin.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
