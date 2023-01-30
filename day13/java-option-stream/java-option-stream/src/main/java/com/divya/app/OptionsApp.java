package com.divya.app;

import com.divya.app.model.Cat;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class OptionsApp {

    public Optional<Cat> getCat(String name){

        Cat cat1= new Cat("c1","3");
        Cat cat2=new Cat("c2","4");
        Map<String, Cat> data = new HashMap<>();
        data.put("c1", cat1);
        data.put("c2", cat2);
        Cat result= data.get(name);
        return Optional.ofNullable(result);

    }
}

