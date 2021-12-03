package com.alphacoder.designpattern;

import com.alphacoder.designpattern.builder.CarBuilder;
import com.alphacoder.designpattern.builder.ManualBuilder;
import com.alphacoder.designpattern.cars.Car;
import com.alphacoder.designpattern.cars.Manual;
import com.alphacoder.designpattern.director.Director;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class BuilderApplication {

	public static void main(String[] args) {
		SpringApplication.run(BuilderApplication.class, args);
		Director director = new Director();

		// Director gets the concrete builder object from the client
		// (application code). That's because application knows better which
		// builder to use to get a specific product.
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);

		// The final product is often retrieved from a builder object, since
		// Director is not aware and not dependent on concrete builders and
		// products.
		Car car = builder.getResult();
		log.info("Car built:\n" + car.getCarType());


		ManualBuilder manualBuilder = new ManualBuilder();

		// Director may know several building recipes.
		director.constructSportsCar(manualBuilder);
		Manual carManual = manualBuilder.getResult();
		log.info("\nCar manual built:\n" + carManual.print());
	}

}
