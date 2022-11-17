public enum PackageSize {
    SMALL(0,15),
    MEDIUM(15,30),
    LARGE(30,50);

    private final int minimumPackageSize;
    private final int maximumPackageSize;

    PackageSize(int minimumPackageSize, int maximumPackageSize) {
        this.minimumPackageSize = minimumPackageSize;
        this.maximumPackageSize = maximumPackageSize;
    }
    public static PackageSize getPackageSize(int minimumPackageSize, int maximumPackageSize){
        for(PackageSize packageSize: values()){
            if(minimumPackageSize >= packageSize.minimumPackageSize
                    && maximumPackageSize<=packageSize.maximumPackageSize){
                return packageSize;
            }
        }
        return null;
    }
}
