# Desenvolva um sistema de software capaz de realizar operações de uma calculadora

## Operações Aritméticas Básicas:
- **Soma**: Adiciona dois números.  
  **Fórmula**: `resultado = num1 + num2`
  
- **Subtração**: Subtrai o segundo número do primeiro.  
  **Fórmula**: `resultado = num1 - num2`
  
- **Multiplicação**: Multiplica dois números.  
  **Fórmula**: `resultado = num1 * num2`
  
- **Divisão**: Divide o primeiro número pelo segundo.  
  **Fórmula**: `resultado = num1 / num2` (assumindo que `num2 ≠ 0`)

## Operações Aritméticas Avançadas:
- **Exponenciação**: Eleva o primeiro número à potência do segundo número.  
  **Fórmula**: `resultado = num1 ** num2`
  
- **Radiciação (Raiz N-ésima)**: Calcula a raiz do primeiro número usando o segundo número como índice da raiz.  
  **Fórmula**: `resultado = num1 ** (1/num2)` (assumindo que `num2 > 0`)
  
- **Módulo (Resto da divisão)**: Retorna o resto da divisão do primeiro número pelo segundo.  
  **Fórmula**: `resultado = num1 % num2` (assumindo que `num2 ≠ 0`)

## Operações Lógicas e Comparativas:
- **Maior**: Verifica qual número é maior.  
  **Fórmula**: `resultado = num1 > num2`
  
- **Menor**: Verifica qual número é menor.  
  **Fórmula**: `resultado = num1 < num2`
  
- **Igualdade**: Verifica se os dois números são iguais.  
  **Fórmula**: `resultado = num1 == num2`
  
- **Diferença**: Verifica se os dois números são diferentes.  
  **Fórmula**: `resultado = num1 != num2`

## Outras Operações Matemáticas:
- **Mínimo**: Retorna o menor dos dois números.  
  **Fórmula**: `resultado = min(num1, num2)`
  
- **Máximo**: Retorna o maior dos dois números.  
  **Fórmula**: `resultado = max(num1, num2)`

## Operações de Cálculo de Juros:
### A. Juros Simples:
Calcula o valor dos juros simples aplicados a um capital com base em uma taxa de juros e um período de tempo.  
**Fórmula**: `juros = capital * taxa * tempo`  
Onde:  
- `capital`: valor inicial  
- `taxa`: taxa de juros (em decimal, por exemplo, 5% = 0,05)  
- `tempo`: tempo aplicado (em anos, meses, etc.)

### B. Juros Compostos:
Calcula os juros compostos acumulados sobre o capital.  
**Fórmula**: `montante = capital * (1 + taxa) ** tempo`

### C. Cálculo de Taxa de Juros:
Determina a taxa de juros a partir do valor de juros e do capital.  
**Fórmula**: `taxa = juros / (capital * tempo)`

## Operações para Amortização e Financiamentos:
- **Valor da Parcela (Sistema Price)**: Calcula o valor das parcelas iguais em um financiamento utilizando o método Price.  
  **Fórmula**: `parcela = capital * [taxa * (1 + taxa) ** tempo] / [(1 + taxa) ** tempo - 1]`

- **Amortização (Sistema SAC)**: Calcula o valor da amortização fixa em cada parcela no Sistema de Amortização Constante (SAC).  
  **Fórmula**: `amortizacao = capital / tempo`

---

## ENTREGA
Você deverá desenvolver dois sistemas de software. O primeiro deve realizar as operações localmente (o nome do projeto deve ser: **CalculadoraLocal**). O segundo, deve realizar as operações por meio de Invocação Remota, através do uso do **JavaRMI** (os nomes dos projetos devem ser: **CalculadoraClient** e **CalculadoraServer**).

### Observações:
- Vocês poderão fornecer os valores como entrada para a aplicação que desejarem, como por exemplo pelo uso de variáveis.
- Vocês **não devem** solicitar os dados de entrada ao usuário, seja por meio de argumentos (`args`) ou por entrada do usuário (`scanf`).

Além disso, você deverá construir o `main` para a sua aplicação, testando cada uma das operações da calculadora. No final, você deverá computar o tempo gasto por cada aplicação para executar cada um dos programas. (Vocês devem enviar um arquivo `.txt` com o tempo gasto por cada aplicação)
