/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.investigacion2b;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Observer;
import io.reactivex.rxjava3.disposables.Disposable;

public class EjemploReactiveX {
    public static void main(String[] args) {
        // Creamos el Observable
        Observable<String> sujeto = Observable.just("HOLAA!!");

        // Creamos el Observer
        Observer<String> observador = new Observer<String>() {
            @Override
            public void onSubscribe(Disposable d) {
            }

            @Override
            public void onNext(String mensaje) {
                System.out.println("Observador recibió: " + mensaje);
            }

            @Override
            public void onError(Throwable e) {
            }

            @Override
            public void onComplete() {
                System.out.println("Terminado!!");
            }
        };

        // El sujeto envía un mensaje al observador
        sujeto.subscribe(observador);
    }
}
