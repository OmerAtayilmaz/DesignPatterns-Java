package builder;

public class Product {
    private String name;
    private String description;
    private String price;
    private String quantity;
    private String category;
    private String subCategory;
    private String brand;
    private String model;
    private String color;
    private String size;
    private String weight;
    private String dimensions;
    private String material;
    private String warranty;
    private String deliveryTime;
    private String deliveryCost;
    private String paymentMethods;
    private String returnPolicy;
    private String otherInfo;
    private String image;
    private String image2;
    private String image3;
    
    public Product(){

    }
  
    public Product(ProductBuilder builder){
        this.name=builder.name;
        this.description=builder.description;
        this.brand=builder.brand;
        this.model=builder.model;
        this.color=builder.color;
        this.size=builder.size;
        this.weight=builder.weight;
        this.dimensions=builder.dimensions;
        this.material=builder.material;
        this.warranty=builder.warranty;
        this.deliveryTime=builder.deliveryTime;
        this.deliveryCost=builder.deliveryCost;
        this.paymentMethods=builder.paymentMethods;
        this.returnPolicy=builder.returnPolicy;
        this.otherInfo=builder.otherInfo;
        this.image=builder.image;
        this.image2=builder.image2;
        this.image3=builder.image3;

    }
  /* full dolu constructor
     public Product(String name, String description, String price, String quantity, String category, String subCategory, String brand, String model, String color, String size, String weight, String dimensions, String material, String warranty, String deliveryTime, String deliveryCost, String paymentMethods,
     String returnPolicy, String otherInfo, String image, String image2, String image3) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.quantity = quantity;
        this.category = category;
        this.subCategory = subCategory;
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.size = size;
        this.weight = weight;
        this.dimensions = dimensions;
        this.material = material;
        this.warranty = warranty;
        this.deliveryTime = deliveryTime;
        this.deliveryCost = deliveryCost;
        this.paymentMethods = paymentMethods;
        this.returnPolicy = returnPolicy;
        this.otherInfo = otherInfo;
        this.image = image;
        this.image2 = image2;
        this.image3 = image3;
    }
    */
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getPrice() {
        return price;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public String getQuantity() {
        return quantity;
    }
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public String getSubCategory() {
        return subCategory;
    }
    public void setSubCategory(String subCategory) {
        this.subCategory = subCategory;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getSize() {
        return size;
    }
    public void setSize(String size) {
        this.size = size;
    }
    public String getWeight() {
        return weight;
    }
    public void setWeight(String weight) {
        this.weight = weight;
    }
    public String getDimensions() {
        return dimensions;
    }
    public void setDimensions(String dimensions) {
        this.dimensions = dimensions;
    }
    public String getMaterial() {
        return material;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public String getWarranty() {
        return warranty;
    }
    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }
    public String getDeliveryTime() {
        return deliveryTime;
    }
    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    public String getDeliveryCost() {
        return deliveryCost;
    }
    public void setDeliveryCost(String deliveryCost) {
        this.deliveryCost = deliveryCost;
    }
    public String getPaymentMethods() {
        return paymentMethods;
    }
    public void setPaymentMethods(String paymentMethods) {
        this.paymentMethods = paymentMethods;
    }
    public String getReturnPolicy() {
        return returnPolicy;
    }
    public void setReturnPolicy(String returnPolicy) {
        this.returnPolicy = returnPolicy;
    }
    public String getOtherInfo() {
        return otherInfo;
    }
    public void setOtherInfo(String otherInfo) {
        this.otherInfo = otherInfo;
    }
    public String getImage() {
        return image;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public String getImage2() {
        return image2;
    }
    public void setImage2(String image2) {
        this.image2 = image2;
    }
    public String getImage3() {
        return image3;
    }
    public void setImage3(String image3) {
        this.image3 = image3;
    }
    @Override
    public String toString(){
        return "Product [name=" + name + ", description=" + description + ", price=" + price + ", quantity=" + quantity + ", category=" + category + ", subCategory=" + subCategory + ", brand=" + brand + ", model=" + model + ", color=" + color + ", size=" + size + ", weight=" + weight + ", dimensions=" + dimensions + ", material=" + material + ", warranty=" + warranty + ", deliveryTime=" + deliveryTime + ", deliveryCost=" + deliveryCost + ", paymentMethods=" + paymentMethods + ", returnPolicy=" + returnPolicy + ", otherInfo=" + otherInfo + ", image=" + image + ", image2=" + image2 + ", image3=" + image3 + "]";
    }
    
    public static class ProductBuilder{
        private String name;
        private String description;
        private String price;
        private String quantity;
        private String category;
        private String subCategory;
        private String brand;
        private String model;
        private String color;
        private String size;
        private String weight;
        private String dimensions;
        private String material;
        private String warranty;
        private String deliveryTime;
        private String deliveryCost;
        private String paymentMethods;
        private String returnPolicy;
        private String otherInfo;
        private String image;
        private String image2;
        private String image3;

        public ProductBuilder name(String name){
            this.name=name;
            return this;
        }
        public ProductBuilder description(String description){
            this.description=description;
            return this;
        }
        public ProductBuilder price(String price){
            this.price=price;
            return this;
        }
        public ProductBuilder quantity(String quantity){
            this.quantity=quantity;
            return this;
        }
        public ProductBuilder category(String category){
            this.category=category;
            return this;
        }
        public ProductBuilder subCategory(String subCategory){
            this.subCategory=subCategory;
            return this;
        }
        public ProductBuilder brand(String brand){
            this.brand=brand;
            return this;
        }
        public ProductBuilder model(String model){
            this.model=model;
            return this;
        }
        public ProductBuilder color(String color){
            this.color=color;
            return this;
        }
        public ProductBuilder size(String size){
            this.size=size;
            return this;
        }
        public ProductBuilder weight(String weight){
            this.weight=weight;
            return this;
        }
        public ProductBuilder dimensions(String dimensions){
            this.dimensions=dimensions;
            return this;
        }
        public ProductBuilder material(String material){
            this.material=material;
            return this;
        }
        public ProductBuilder warranty(String warranty){
            this.warranty=warranty;
            return this;
        }
        public ProductBuilder deliveryTime(String deliveryTime){
            this.deliveryTime=deliveryTime;
            return this;
        }
        public ProductBuilder deliveryCost(String deliveryCost){
            this.deliveryCost=deliveryCost;
            return this;
        }
        public ProductBuilder paymentMethods(String paymentMethods){
            this.paymentMethods=paymentMethods;
            return this;
        }
        public ProductBuilder returnPolicy(String returnPolicy){
            this.returnPolicy=returnPolicy;
            return this;
        }
        public ProductBuilder otherInfo(String otherInfo){
            this.otherInfo=otherInfo;
            return this;
        }
        public ProductBuilder image(String image){
            this.image=image;
            return this;
        }
        public ProductBuilder image2(String image2){
            this.image2=image2;
            return this;
        }
        public ProductBuilder image3(String image3){
            this.image3=image3;
            return this;
        }
        public Product build(){
           Product p=new Product(this);
           return p;
        }

    }
}
