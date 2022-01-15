package id.fahrizal.crudfactory.employee

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import id.fahrizal.crudfactory.databinding.ActivityEmployeeDetailBinding

class EmployeeDetailActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityEmployeeDetailBinding
    private val viewModel: EmployeeDetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityEmployeeDetailBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        observePageProperties()
        observeEmployee()
        viewModel.setPageState(getPageStateFromIntent())
        viewModel.getPageProperties()
        viewModel.getEmployee()
    }

    private fun observePageProperties() {
        viewModel.pagePropertiesLiveData.observe(this) {
            viewBinding.idEt.isEnabled = it.idInputEnable
            viewBinding.nameEt.isEnabled = it.nameInputEnable
            viewBinding.actionBtn.text = it.actionButtonName
        }
    }

    private fun observeEmployee() {
        viewModel.employeeLiveData.observe(this) {
            viewBinding.idEt.setText(it.id)
            viewBinding.nameEt.setText(it.name)
        }
    }

    private fun getPageStateFromIntent(): String = intent.getStringExtra("PAGE_STATE") ?: ""

    companion object {

        private const val PAGE_STATE = "PAGE_STATE"

        fun getIntent(context: Context, state: String): Intent {
            val intent = Intent(context, EmployeeDetailActivity::class.java)

            intent.putExtra(PAGE_STATE, state)
            return intent
        }
    }
}