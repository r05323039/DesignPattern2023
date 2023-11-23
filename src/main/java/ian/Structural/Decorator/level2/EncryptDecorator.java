package ian.Structural.Decorator.level2;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class EncryptDecorator extends AbstractTextFileDecorator {
    public EncryptDecorator(TextFile file) {
        super(file);
    }

    @Override
    public String open() {
        return super.open() + " with " + this.getClass().getSimpleName();
    }

    @Override
    public String read() {
        String content = super.read();
        return encrypt(content);
    }

    private String encrypt(String content) {
        if (content == null || content.isEmpty()) {
            throw new RuntimeException("file is null");
        }
        int halfLength = content.length() / 2;
        return IntStream.range(0, content.length())
                .mapToObj(i -> i < halfLength ? "*" : String.valueOf(content.charAt(i)))
                .collect(Collectors.joining());
    }
}

