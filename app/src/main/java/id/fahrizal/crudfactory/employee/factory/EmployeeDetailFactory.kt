package id.fahrizal.crudfactory.employee.factory

import id.fahrizal.crudfactory.employee.model.Employee
import id.fahrizal.crudfactory.employee.state.ViewState
import id.fahrizal.crudfactory.employee.variant.DeleteEmployeeDetail
import id.fahrizal.crudfactory.employee.variant.EditEmployeeDetail
import id.fahrizal.crudfactory.employee.variant.EmployeeDetail
import id.fahrizal.crudfactory.employee.variant.NewEmployeeDetail

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version EmployeeDetailFactory, v 0.1 14/01/22 06.01 by Fahrizal Sentosa
 */
class EmployeeDetailFactory(private val employee: Employee) {

    fun create(state: String): EmployeeDetail {
        return when (state) {
            ViewState.EDIT -> EditEmployeeDetail(employee)
            ViewState.DELETE -> DeleteEmployeeDetail(employee)
            else -> NewEmployeeDetail()
        }
    }
}