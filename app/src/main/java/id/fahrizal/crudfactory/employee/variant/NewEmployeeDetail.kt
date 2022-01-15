package id.fahrizal.crudfactory.employee.variant

import id.fahrizal.crudfactory.employee.model.Employee
import id.fahrizal.crudfactory.employee.state.ViewState
import id.fahrizal.crudfactory.employee.variant.init.EmployeeDetailPageProperty

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version NewEmployeeDetail, v 0.1 14/01/22 06.15 by Fahrizal Sentosa
 */
class NewEmployeeDetail : EmployeeDetail {

    override fun getPageProperties(): EmployeeDetailPageProperty {
        return EmployeeDetailPageProperty(
            ViewState.NEW,
            idInputEnable = true,
            nameInputEnable = true,
            actionButtonName = "Create New"
        )
    }

    override fun getEmployee(): Employee {
        return Employee("", "")
    }

    override fun performAction() {
        println("Create New Employee")
    }
}