package ian.Structural.Proxy.level1;

class SensitiveDataProxy implements SensitiveData {
    private SensitiveDataImpl service;

    private String password;

    public SensitiveDataProxy(String password) {
        this.password = password;
    }

    @Override
    public String getData() {
        if (!authenticate(password)) {
            return "密碼錯誤";
        }

        if (service == null) {
            service = new SensitiveDataImpl();
        }
        return service.getData();
    }

    private boolean authenticate(String password) {
        return "admin".equals(password);
    }
}
