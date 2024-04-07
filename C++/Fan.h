#ifndef FAN_H
#define FAN_H

#include <string>

class Fan {
private:
    int speed;
    double radius;
    std::string color;

public:
    Fan(); // Default constructor
    Fan(double newRadius); //  constructor for specific radius

    std::string toString(); // Method to return a string description of the fan

    // Accessors and mutators
    int getSpeed();
    void setSpeed(int speed);
    double getRadius();
    void setRadius(double radius);
    std::string getColor();
    void setColor(std::string color);
};

#endif /* FAN_H */
