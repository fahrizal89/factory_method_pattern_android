package id.fahrizal.crudfactory

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.fahrizal.crudfactory.employee.model.Employee

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version MainViewModel, v 0.1 02/01/22 10.52 by Fahrizal Sentosa
 */
class MainViewModel : ViewModel() {

    val employeeLiveData by lazy { MutableLiveData<Employee>() }

    fun getInitialEmployee() {
        employeeLiveData.value = getMockEmployee()
    }

    private fun getMockEmployee(): Employee = Employee("001", "Fahrizal")
}