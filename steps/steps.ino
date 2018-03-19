#include <Wire.h> // Must include Wire library for I2C
#include <SparkFun_MMA8452Q.h>

MMA8452Q accel;

void setup() {
  Serial.begin(9600);
  accel.init(SCALE_4G,ODR_6);
}

void loop() {
  if(accel.available()){
    accel.read();
    writeAccels();
  }
}

void writeAccels(){
   Serial.print(accel.x, 3);
  Serial.print(",");
  Serial.print(accel.y, 3);
  Serial.print(",");
  Serial.print(accel.z, 3);
  Serial.println("");
}

