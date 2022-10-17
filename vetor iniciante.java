   Scanner in = new Scanner(System.in);
        
    int[] Atriangulo = new int[3];
    for (int i=0; i<3; i++){
        System.out.println("Digite um lado do triângulo ");
        Atriangulo[i] = in.nextInt();
    }
    
    // Atriangulo carrega os 3 lados do triangulo
    
    // pegar o maior valor do triangulo
        // armazena a posicao que esta o maior valor
    
    //
    
    if(Atriangulo[0] == Atriangulo[1] && Atriangulo[0] == Atriangulo[2] && Atriangulo[1] == Atriangulo[2]){
        System.out.println("é um equilátero");
    }
    if(Atriangulo[0] != Atriangulo[1] && Atriangulo[0] != Atriangulo[2] && Atriangulo[1] != Atriangulo[2]){
        System.out.println("é um escaleno");
    }
    

    
    }
    
    
    
}
