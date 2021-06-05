package com.company;

public class StoreVitrine {

    Food[] StoreVitrine = new Food[10];

    public void GetProduct (Food item){

        for(int i = 0;  i < StoreVitrine.length; i++ ){

            if(StoreVitrine[i] == null){
                StoreVitrine[i] = item;
                break;
            }
        }

    }

    public void ShowVitrine (){

        for(int i = 0;  i < StoreVitrine.length; i++ ){

            System.out.println(StoreVitrine[i].Name);

        }

    }
}
