class Fan
   # Defines getter and setter methods for speed, radius, and color
  attr_accessor :speed, :radius, :color
   # creates a default constructer with default values for the datafields
  def initialize
    @speed = 1
    @radius = 1.53
    @color = "green"
  end
  # constructor used to specify a radius value
  def initialize_with_radius(new_radius)
    @radius = new_radius
  end
  # to string method that is overidden in order to print out given print statment
  def to_s
    "A %.2f inch %s fan at a speed of %d" % [@radius, @color, @speed]
  end
end


# Example usage:
fan1 = Fan.new
fan1.speed = 3
fan1.initialize_with_radius(10.26)
fan1.color = "yellow"
puts fan1.to_s

fan2 = Fan.new
fan2.initialize_with_radius(5.79)
fan2.speed = 2
fan2.color = "blue"
puts fan2.to_s

fan3 = Fan.new
puts fan3.to_s
