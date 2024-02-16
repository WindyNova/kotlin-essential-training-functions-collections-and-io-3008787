import org.junit.Test
import org.mockito.ArgumentMatchers.anyString
import org.mockito.Mockito

class Test {
    @Test
    fun `lolz`(){
        val analytics=Mockito.mock(AnalyticsClient::class.java)
        val viewModel =ViewModel(analytics)
        viewModel.submitClicked()
        Mockito.verify(analytics).track(anyString())
    }
}