package ru.skillbranch.notesmvp.presenter


class MainPresenter(val model:DataApi) {
    private var context: ViewApi? = null
    fun init(_view: ViewApi){
        context = _view
        context.showData()
        context.clickButtonGet()
        context.clickBattonSave()
    }




    fun distroy(){
        context = null
    }

    fun saveData(text:String){
        model.saveData(text)
    }
    fun getData():String = model.getData()


}
