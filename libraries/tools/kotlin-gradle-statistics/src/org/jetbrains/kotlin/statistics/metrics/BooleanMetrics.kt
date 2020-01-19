/*
 * Copyright 2010-2019 JetBrains s.r.o. and Kotlin Programming Language contributors.
 * Use of this source code is governed by the Apache 2.0 license that can be found in the license/LICENSE.txt file.
 */

package org.jetbrains.kotlin.statistics.metrics

import org.jetbrains.kotlin.statistics.metrics.BooleanAnonymizationPolicy.*
import org.jetbrains.kotlin.statistics.metrics.BooleanOverridePolicy.*


enum class BooleanMetrics(val type: BooleanOverridePolicy, val anonymization: BooleanAnonymizationPolicy, val perProject: Boolean = false) {

    // User environment

    // whether the build is executed from IDE or from console
    EXECUTED_FROM_IDEA(OVERRIDE, SAFE),


    // Build script

    //annotation processors

    ENABLED_KAPT(OR, SAFE),
    ENABLED_DAGGER(OR, SAFE),
    ENABLED_DATABINDING(OR, SAFE),


    //TODO compiler plugins:
    //All-open
    //no-arg
    //jpa-support
    //SAM-with-receiver

    HMPP_ENABLED(OR, SAFE),


    // Component versions


    // Enabled features

    // Build performance


    // Unprocessed

}
