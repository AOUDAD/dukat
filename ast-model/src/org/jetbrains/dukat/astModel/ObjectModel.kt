package org.jetbrains.dukat.astModel

import org.jetbrains.dukat.astCommon.NameEntity

data class ObjectModel(
        override val name: NameEntity,
        val members: List<MemberModel>,

        val parentEntities: List<HeritageModel>
) : TopLevelModel
