package org.mifos.mobile.ui.beneficiary.presentation

import android.content.res.Configuration
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.mifos.mobile.R
import org.mifos.mobile.core.ui.theme.MifosMobileTheme


/**
 * This is a composable function that represent the beneficiary screen and the peremeters include
 * @param[addiconClicked] to navigate to the add screen
 * @param[scaniconClicked] to navigate to the scanicon screen
 * @param[uploadiconClicked] to navigate to the upload icin screen
 **/


@Composable
fun beneficiaryscreen(
    topAppbarNavigateback:()->Unit,
    addiconClicked: ()->Unit,
    scaniconClicked: ()->Unit,
    uploadiconClicked :()->Unit
){
    BeneficiaryTopappbar(topAppbarNavigateback,)
    Column(
        modifier = Modifier.padding(dimensionResource(id = R.dimen.padding_10dp))
    ){
        Text(
            stringResource(id = R.string.select_mode),
            fontSize = 24.sp,
            color =  MaterialTheme.colorScheme.onSurface
        )

        Text(
            modifier = Modifier.padding(top =16.dp),
            text = stringResource(R.string.add_beneficiary_option),
            fontSize = 17.sp,
            color =  MaterialTheme.colorScheme.onSurface
        )

        multipleIcons(
            modifier = Modifier.padding(top = 20.dp),
            addIconclicked = addiconClicked,
            scanIconClicked = scaniconClicked,
            uploadIconClicked = uploadiconClicked
        )


    }

}






@Preview(
    name = "Night Mode",
    uiMode = Configuration.UI_MODE_NIGHT_YES,
)
@Preview(
    name = "Day mode",
    uiMode = Configuration.UI_MODE_NIGHT_NO,
)
@Composable
fun beneficiaryscreenpreview() {
    MifosMobileTheme{
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
        ) {
            beneficiaryscreen({},{},{},{})
        }
    }
}