package com.io.geekmenu.data.state

sealed class State {
    class LoadingState(val isLoading:Boolean): State()
    class SuccessObjectState<T>(val data: T): State()
    object NoItemState : State()
    class ErrorState(val message:String,val errorCode:Int): State()
}
