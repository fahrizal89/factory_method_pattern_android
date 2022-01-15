package id.fahrizal.crudfactory.employee.variant

import id.fahrizal.crudfactory.employee.model.Employee
import id.fahrizal.crudfactory.employee.state.ViewState
import id.fahrizal.crudfactory.employee.variant.init.EmployeeDetailPageProperty

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version DeleteEmployeeDetail, v 0.1 14/01/22 06.16 by Fahrizal Sentosa
 */
class DeleteEmployeeDetail(private val employee: Employee) : EmployeeDetail {

    override fun getPageProperties(): EmployeeDetailPageProperty {
        return EmployeeDetailPageProperty(
            ViewState.DELETE,
            idInputEnable = false,
            nameInputEnable = false,
            actionButtonName = "Edit"
        )
    }

    override fun getEmployee(): Employee {
        return employee
    }

    override fun performAction() {
        println("Delete Employee")
    }
}