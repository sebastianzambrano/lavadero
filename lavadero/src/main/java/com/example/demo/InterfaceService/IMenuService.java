package com.example.demo.InterfaceService;


import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.CrudSpringBoot"})
public interface IMenuService {
    public void mostrar();

}
