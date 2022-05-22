package com.github.knatsuki.jumpy.services

import com.intellij.openapi.project.Project
import com.github.knatsuki.jumpy.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
