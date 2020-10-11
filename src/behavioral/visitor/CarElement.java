package behavioral.visitor;

interface CarElement {
  void accept(CarElementVisitor visitor);
}