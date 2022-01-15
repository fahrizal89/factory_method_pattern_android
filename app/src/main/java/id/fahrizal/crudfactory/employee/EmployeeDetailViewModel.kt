package id.fahrizal.crudfactory.employee

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import id.fahrizal.crudfactory.employee.factory.EmployeeDetailFactory
import id.fahrizal.crudfactory.employee.model.Employee
import id.fahrizal.crudfactory.employee.variant.EmployeeDetail
import id.fahrizal.crudfactory.employee.variant.init.EmployeeDetailPageProperty

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version EmployeeDetailViewModel, v 0.1 09/01/22 11.50 by Fahrizal Sentosa
 */
class EmployeeDetailViewModel : ViewModel() {

    val pagePropertiesLiveData by lazy { MutableLiveData<EmployeeDetailPageProperty>() }
    val employeeLiveData by lazy { MutableLiveData<Employee>() }
    private val employeeDetailFactory: EmployeeDetailFactory = EmployeeDetailFactory(createMockEmployee())
    private lateinit var employeeDetail: EmployeeDetail

    fun setPageState(state: String) {
        employeeDetail = employeeDetailFactory.create(state)
    }

    fun getPageProperties() {
        //getPageProperties as an abstract
        val pageProperties = employeeDetail.getPageProperties()

        //set properties value to UI
        pagePropertiesLiveData.value = pageProperties
    }

    fun getEmployee() {
        employeeLiveData.value = employeeDetail.getEmployee()
    }

    fun performAction() {
        //perform action as an abstract
        employeeDetail.performAction()
    }

    //this function to create mock data just for learning
    private fun createMockEmployee(): Employee {
        return Employee("001", "Fahrizal")
    }
}