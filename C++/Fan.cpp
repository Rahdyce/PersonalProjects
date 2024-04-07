#include "Fan.h"

Fan::Fan() {
    speed = 1;
    radius = 1.53;
    color = "green";
}

Fan::Fan(double newRadius) {
    speed = 1;
    radius = newRadius;
    color = "green";
}

std::string Fan::toString() {
    return "A " + std::to_string(radius) + " inch " + color + " fan at a speed of " + std::to_string(speed);
}

int Fan::getSpeed() {
    return speed;
}

void Fan::setSpeed(int speed) {
    this->speed = speed;
}

double Fan::getRadius() {
    return radius;
}

void Fan::setRadius(double radius) {
    this->radius = radius;
}

std::string Fan::getColor() {
    return color;
}

void Fan::setColor(std::string color) {
    this->color = color;
};

int main() {
    Fan fan1;
	fan1.setSpeed(3);
	fan1.setRadius(10.26);
    fan1.setColor("yellow");
	std::cout << fan1.toString() << std::endl;
    
	Fan fan2(5.79);
    fan2.setSpeed(2);
    fan2.setColor("blue");
    std::cout << fan2.toString() << std::endl;
	
	Fan fan3();
	std::cout << fan3.toString() << std::endl;

    return 0;
}
