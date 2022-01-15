package id.fahrizal.crudfactory.employee.variant

import id.fahrizal.crudfactory.employee.model.Employee
import id.fahrizal.crudfactory.employee.variant.init.EmployeeDetailPageProperty

/**
 * @author Fahrizal Sentosa (fahrizal.sentosa@dana.id)
 * @version EmployeeDetail, v 0.1 14/01/22 06.04 by Fahrizal Sentosa
 */
interface EmployeeDetail {

    fun getPageProperties(): EmployeeDetailPageProperty

    fun getEmployee(): Employee

    fun performAction()
}