programa
{
	
	funcao inicio()
	{
          inteiro hora, minutos, segundos, total      
		escreva("Tempo de duração de entrada em segundos da fábrica?")
		leia(segundos)

		hora= segundos/3600
		minutos= segundos % 3600 /60
		segundos= ( segundos % 3600) % 60

		escreva("Duração em segundos do evento foi: ", hora, " horas(s) ", minutos, "minuto(s) e ", segundos, "segundo(s)")
		
		
		 

	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 388; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */