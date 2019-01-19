package com.vladislawfox.base.domain.mapper

import java.util.*

/**
 * Created by vladislawfox on 1/18/19.
 */
abstract class Mapper<From, To> : BaseMapper<From, To>() {
    abstract fun reverse(to: To): From
    fun reverse(tos: List<To>): List<From> {
        val result = ArrayList<From>(tos.size)
        for (to in tos) {
            result.add(reverse(to))
        }
        return result
    }
}