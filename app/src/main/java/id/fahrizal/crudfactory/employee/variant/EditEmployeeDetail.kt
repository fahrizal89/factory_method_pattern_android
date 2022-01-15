package id.fahrizal.crudfactory.employee.variant

import id.fahrizal.crudfactory.employee.model.Employee
import id.fahrizal.crudfactory.employee.state.ViewState
import id.fahrizal.crudfactory.employee.variant.init.EmployeeDetailPageProperty

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version EditEmployeeDetail, v 0.1 14/01/22 06.15 by Fahrizal Sentosa
 */
class EditEmployeeDetail(private val employee: Employee) : EmployeeDetail {

    override fun getPageProperties(): EmployeeDetailPageProperty {
        return EmployeeDetailPageProperty(
            ViewState.EDIT,
            idInputEnable = true,
            nameInputEnable = true,
            actionButtonName = "Edit"
        )
    }

    override fun getEmployee(): Employee {
        return employee
    }

    override fun performAction() {
        println("Edit Employee")
    }
}