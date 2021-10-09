package com.htm.domain.usecase

abstract class UseCase<in Params, out T> where T : Any {

    abstract suspend fun executeWork(params: Params? = null): T?

    open fun onCleared() {}
}