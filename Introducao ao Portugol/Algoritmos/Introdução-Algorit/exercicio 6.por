programa
{
	
	funcao inicio()
	{
            /*Construa um programa em c que, tendo como dados de entrada dois pontos
            quaisquer no plano, P(x1, y1) e P(x2, y2), escreva a distância entre eles. A fórmula
            que efetua tal cálculo é:*/

           inteiro x1,x2,y1,y2,D

           escreva("Digite um valor para x1:")
           leia(x1)
           escreva("Digite um valor para x2:")
           leia(x2)
           escreva("Digite um valor para y1:")
           leia(y1)
           escreva("Digite um valor para y2:")
           leia(y2)

           D = (x1-x2)*2 + (y1-y2)*2
           escreva("A distãncia entre eles é :", D)
	
		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 652; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */