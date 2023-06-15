class Car:
    speed=0
    started=False
    
    def start(self):
        self.started = True
        print("Car started, let's ride!")
        
    def increase_speed(self,delta):
        if self.started:
            self.speed = self.speed + delta
            print("goooooooooo!")
        else:
            print("You need to start the car first!")
    
    def stop(self):
        self.speed = 0
        print("Halting")
        
car = Car()
car.increase_speed(10)
car.start()
car.increase_speed(40)