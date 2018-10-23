# generics-intro
Introdução as coleções e exemplo de uso.

O uso de generics oferece os seguintes benefícios: 
- Reuso
- Type safety
- Perfomance

No exemplo foi criado uma lista com List, pense num programa que recebe a quantidade de itens que serão informados e logo após o usuário cadastra os itens, que são adicionados a lista, depois o programa exibe o primeiro item e a lista completa no output.
Problemas que podem ocorrer: 
- Se criarmos um programa que recebe inteiro a lista não iria funcionar para outros tipos
- Poderíamos criar uma lista de objetos, já que no java tudo são objetos, porém teríamos o problema de ficar fazendo casting para tratar os tipos, com isso consumindo recursos para garantir a tipificação do objeto. 

Solução de exemplo:
- Foi criada uma classe ImprimirService que é generics, (no exemplo representado pela letra T), ao utilizar aquela classe no momento da declaração da mesma você determina qual será o tipo usado '''ImprimirServices <Tipo> impServices = new ImprimirServices<>()'''. 

Com o generics ofertamos o reuso dao classe ImprimirService para qualquer tipo, mantivemos a type safety e performance sem precisa ficar realizando casting's agora desnecessários. 
