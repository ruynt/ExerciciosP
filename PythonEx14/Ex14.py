class Configuracao:
    _instancia = None

    def __new__(cls):
        if cls._instancia is None:
            cls._instancia = super(Configuracao, cls).__new__(cls)
            cls._instancia._inicializar()
        return cls._instancia

    def _inicializar(self):
        self.dados = {}

    def set_dado(self, chave, valor):
        self.dados[chave] = valor

    def get_dado(self, chave):
        return self.dados.get(chave, None)

config1 = Configuracao()
config2 = Configuracao()

config1.set_dado("host", "localhost")
config2.set_dado("porta", 8080)

print(config1.get_dado("host"))
print(config2.get_dado("porta"))
print(config1 is config2)
