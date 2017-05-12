package jsinterop.generator.externs.inheritance;

import java.lang.String;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class SimpleClass extends ParentClass implements Parent1Interface, Parent2Interface {
  public String classProperty;
  public String greatParentInterfaceProperty;
  public boolean parent1InterfaceProperty;
  public double parent2InterfaceProperty;

  public native boolean classMethod(String foo);

  @JsProperty
  public native String getGreatParentInterfaceProperty();

  @JsProperty
  public native double getParent2InterfaceProperty();

  public native String greatParentInterfaceMethod(boolean foo);

  @JsProperty
  public native boolean isParent1InterfaceProperty();

  public native boolean parent1InterfaceMethod(double foo);

  public native double parent2InterfaceMethod();

  @JsProperty
  public native void setGreatParentInterfaceProperty(String greatParentInterfaceProperty);

  @JsProperty
  public native void setParent1InterfaceProperty(boolean parent1InterfaceProperty);

  @JsProperty
  public native void setParent2InterfaceProperty(double parent2InterfaceProperty);
}
