package net.taikula.architecturescompare.mvi

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import net.taikula.architecturescompare.R
import net.taikula.architecturescompare.mvi.ui.theme.ArchitecturesCompareTheme

@Composable
fun Counter(
    modifier: Modifier = Modifier,
    viewModel: CounterViewModel = viewModel(),
) {

    val countState by viewModel.counterState.collectAsState()

    Column {
        Text(
            text = countState.curCount.toString(),
            style = MaterialTheme.typography.titleLarge,
        )
        Button(onClick = { viewModel.addRandom() }) {
            Text(text = stringResource(id = R.string.add_random))
        }
        Button(onClick = { viewModel.reset() }) {
            Text(text = stringResource(id = R.string.reset))
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CounterPreview() {
    ArchitecturesCompareTheme {
        Counter()
    }
}