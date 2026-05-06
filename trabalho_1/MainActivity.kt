// MainActivity.kt
package org.gxbrxxlkk.calc_eq2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.gxbrxxlkk.calc_eq2.ui.theme.Calc_eq2_v1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Calc_eq2_v1Theme {
                Scaffold(
                    modifier = Modifier.fillMaxSize()
                ) { innerPadding ->
                    Calculadora_eq2(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Calculadora_eq2(modifier: Modifier) {
    // Estados que armazenam os valores dos campos

    //remember: Mantém o estado durante recomposições do app (cache)
    //mutableStateOf: Observa mudanças e atualiza a UI automaticamente
    var linha by remember { mutableStateOf("") }
    var linha1 by remember { mutableStateOf("") }
    var linha2 by remember { mutableStateOf("") }
    var problema : eq2g by remember { mutableStateOf(eq2g()) }


    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(32.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Título
        Text(
            text = "Calculadora de equação de segundo grau",
            fontSize = 28.sp,
            style = MaterialTheme.typography.headlineMedium
        )

        Spacer(modifier = Modifier.height(32.dp))

        // Campo para primeiro número
        OutlinedTextField(
            value = linha,
            onValueChange = { novovalor ->
                linha = novovalor
            },
            label = { Text("Insira o coeficiente A") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),

            )

        OutlinedTextField(
            value = linha1,
            onValueChange = { novovalor ->
                linha1 = novovalor
            },
            label = { Text("Insira o coeficiente B") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),

            )

        OutlinedTextField(
            value = linha2,
            onValueChange = { novovalor ->
                linha2 = novovalor
            },
            label = { Text("Insira o coeficiente C") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth(),

            )

        Spacer(modifier = Modifier.height(16.dp))

        Button(
            onClick = {
                problema = eq2g(linha.toDouble(), linha1.toDouble(), linha2.toDouble())

            })
        {
            Text("Calcular")
        }


        Spacer(modifier = Modifier.height(24.dp))

        // Exibição do resultado colocar concavidade (concavo ou convexo), delta, x1, x2, coordenadas do vértice
        Card(
            modifier = Modifier.fillMaxWidth(),
            colors = CardDefaults.cardColors(
                containerColor = MaterialTheme.colorScheme.primaryContainer
            )
        ) {
            if (problema.delta < 0) Text( "Delta negativo")

            else

            Column(
                modifier = Modifier.padding(16.dp)
            ) {

                Row {
                    Text("Concavidade: ")
                    Text(if (problema.concavo) "Feliz (para cima)" else "Triste (para baixo)")
                }

                Row {
                    Text("Delta: ")
                    Text("${problema.delta}")
                }

                Row {
                    Text("x1: ")
                    Text("${"%.2f".format(problema.x1)}")
                }

                Row {
                    Text("x2: ")
                    Text("${"%.2f".format(problema.x2)}")
                }
                Row {
                    Text("Vértices: ")
                    Text("${problema.vertice}")
                }
            }
        }

    }
}
//// Pré-visualização para desenvolvimento
//@Preview(showBackground = true, showSystemUi = true)
//@Composable
//fun PreviewSomaApp() {
//    SomaAppTheme {
//        SomaApp()
//    }
//} Fazer funcionar no aplicativo android e no terminal