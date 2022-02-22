package com.github.yyt231.mvvmplugn.services

import com.intellij.openapi.project.Project
import com.github.yyt231.mvvmplugn.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
