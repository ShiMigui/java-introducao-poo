# Curso de Java completo - Introdução a Programação Orientada a Objeto

Este repositório foi criado para armazenar os exercícios e projetos desenvolvidos no curso de Java da Udemy. Recomendo que, se quiser ter acesso à experiência completa, inscreva-se no curso. Abaixo estão detalhes sobre o curso:

## Links

Curso: [Java completo - Programação Orientada a Objetos + Projetos](https://www.udemy.com/course/java-curso-completo/).

Youtube: [Dev Superior](https://www.youtube.com/@DevSuperior).

Github: [Nelio Alves](https://github.com/acenelio).

Site: [Dev Superior](https://devsuperior.com.br).

## Exercícios

- [Exercício 1](#exercício-1)
- [Exercício 2](#exercício-2)
- [Exercício 3](#exercício-3)
- [Exercício 4](#exercício-4)
- [Exercício 5](#exercício-5)
- [Stock](#stock)
- [Triangle](#triangle)
- [Circumference](#circumference)

### Exercício 1

Fazer um programa para ler largura e altura de um retângulo. Em seguida, mostrar na tela sua área, perímetro e diagonal. Usar uma classe como mostrada no projeto ao lado:

|Rectangle|
|---|
|Width: double|
|Height: double|
|Area(): double|
|Perimeter(): double|
|Diagonal(): double|

### Exercício 2

Fazer um programa para ler os dados de um funcionário(nome, salário bruto e imposto). Em seguida, mostrar os dados do funcionário(nome e salário bruto). Em seguida, aumentar o salário do funcionário com base em uma porcentagem dada(somente o salário bruto é afetado pela porcentagem) e mostar novamente os dados do funcionário. Siga a classe:

|Employee|
|---|
|Name: String|
|GrossSalary: double|
|Tax: double|
|NetSalary(): double|
|IncreaseSalary(percentage: double): void|

### Exercício 3

Fazer um programa para ler o nome e as notas que ele obteve nos três trimestres dos ano(primeiro trimestre vale 30, o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no ano. Dizer também se o aluno está aprovado(PASS) ou não(FAILED) e, em caso negativo, quantos pontos faltam para o aluno obter a pontuação mínima para ser aprovado(60%). Crie uma classe Student para resolver este problema:

#### Exercício 3 - Exemplos

```java
Alex Green
27.00
31.00
32.00 
FINAL GRADE = 90.00
PASS
```

```java
Alex Green
17.00
20.00
15.00 
FINAL GRADE = 52.00
FAILED
MISSING 8.00 POINTS
```

### Exercício 4

Faça um programa que leia a cotação do dólar, depois um valor em dólares para ser comprado em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando que ainda a pessoa tem de pagar o 6% de IOF sobre o valor do dólar. Crie uma classe Currency para ser responsável pelos cálculos.

### Exercício 5

Em um banco, para se cadastrar uma conta bancária, é necessário inserir o código da conta, nome do titular e depósito inicial, o código não pode ser alterado e o depósito inicial pode não ocorrer, neste caso o valor em conta deve ser, naturalmente, 0. Por fim, cada saque tem uma taxa de $5.00. Nota: A conta fica pode ficar negativa em caso de não ter saldo para o saque ou para a taxa. Você deve fazer um programa que faça o cadastro de uma conta no banco, dando a opção de mostrar ou não a informação de valor inicial. Em seguida, realizar um depósito e um saque, sempre mostrando a situação atual da conta.

### Stock

Fazer programa para ler os dados de um produto(nome, quantidade em estoque e preço):

- Mostrar os dados do produto
- Realizar entrada no estoque e mostrar novamente os dados do produto
- Realizar saída no estoque e mostrar novamente os dados do produto

|Product|
|---|
| Name: String |
| Price: double |
| Quantity: int |
| TotalValueInStock(): double |
| AddProducts(): void |
| RemoveProducts(): void |

### Triangle

Faça um programa que receba três pontos de dois triângulos (x e y) e calcule suas áreas, assim como mostre o maior triângulo(em área).

### Circumference

Calcule o valor de circumferencia e volume de um círculo com o valor do raio (inserido pelo usuário).
