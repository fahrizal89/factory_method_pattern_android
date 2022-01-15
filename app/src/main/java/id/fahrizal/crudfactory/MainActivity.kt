package id.fahrizal.crudfactory

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import id.fahrizal.crudfactory.databinding.ActivityMainBinding
import id.fahrizal.crudfactory.employee.EmployeeDetailActivity
import id.fahrizal.crudfactory.employee.state.ViewState

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    private val viewModel: MainViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)
        observeEmployeeData()
        getEmployeeData()
        initButton()
    }

    private fun observeEmployeeData() {
        viewModel.employeeLiveData.observe(this) {
            viewBinding.idTv.text = it.id
            viewBinding.nameTv.text = it.name
        }
    }

    private fun getEmployeeData() {
        viewModel.getInitialEmployee()
    }

    private fun initButton() {
        viewBinding.newBtn.setOnClickListener {
            val intent = EmployeeDetailActivity.getIntent(this, ViewState.NEW)
            startActivity(intent)
        }
        viewBinding.editBtn.setOnClickListener {
            val intent = EmployeeDetailActivity.getIntent(this, ViewState.EDIT)
            startActivity(intent)
        }
        viewBinding.deleteBtn.setOnClickListener {
            val intent = EmployeeDetailActivity.getIntent(this, ViewState.DELETE)
            startActivity(intent)
        }
    }

}