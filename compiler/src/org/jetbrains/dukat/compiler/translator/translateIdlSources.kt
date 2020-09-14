package org.jetbrains.dukat.compiler.translator

import org.jetbrains.dukat.astModel.SourceSetModel
import org.jetbrains.dukat.idlReferenceResolver.DirectoryReferencesResolver
import java.io.File

fun translateIdlSources(sources: List<String>): SourceSetModel {
    val files = sources.map { File(it).absolutePath }
    val idlTranslator = IdlInputTranslator(DirectoryReferencesResolver())
    return SourceSetModel(
            sourceName = files,
            sources = files.flatMap { filename ->
                idlTranslator.translate(File(filename).absolutePath).sources
            }.distinct()
    )
}