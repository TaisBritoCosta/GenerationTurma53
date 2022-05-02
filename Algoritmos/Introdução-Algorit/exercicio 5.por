programa
{
	
	funcao inicio()
	{
	     /*Faça um sistema que leia as 3 notas de um aluno e calcule a média final deste
aluno. Considerar que a média é ponderada e que o peso das notas é: 2,3 e 5,
respectivamente.*/

           real nota1,nota2,nota3,mFinal
           
		escreva("Digite sua primeira nota:\n")
		leia(nota1)
		escreva("Digite a segunda nota:\n")
		leia(nota2)
		escreva("Agora sua terceira e ultima nota:\n")
		leia(nota3)

	
          mFinal = (nota1*2 + nota2*3 + nota3*5) / (2+3+5)
          escreva("Agora digite a sua média final: " + mFinal)



		
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 572; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */