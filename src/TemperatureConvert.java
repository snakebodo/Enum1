public enum TemperatureConvert {
    C_F('c', 'f', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn * 1.8f + 32;
        }
    }),
    C_K('c', 'k', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn + 273;
        }
    }),
    K_C('k', 'c', new Converter() {
        @Override
        public float convert(float tempIn) {
            return tempIn - 273;
        }
    }),
    F_C('f', 'c', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) / 1.8f;
        }
    }),
    F_K('f', 'k', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn - 32) / 1.8f + 273;
        }
    }),
    K_F('k', 'f', new Converter() {
        @Override
        public float convert(float tempIn) {
            return (tempIn + 273) * 1.8f + 32;
        }
    });

    private float inputTemp;
    private float outputTemp;
    private Converter converter;

    public static float convertTemperature(char input, char
            output, float temp) {
        for (TemperatureConvert temperatureConverter : values())
        {
            if (temperatureConverter.inputTemp == input &&
                    temperatureConverter.outputTemp == output) {
                return
                        temperatureConverter.converter.convert(temp);
            }
        }
        return Integer.MIN_VALUE;
    }


    TemperatureConvert(char inputTemp, char outputTemp, Converter converter) {
        this.inputTemp = inputTemp;
        this.outputTemp = outputTemp;
        this.converter = converter;
    }
}
