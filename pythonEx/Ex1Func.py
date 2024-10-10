def calc_valor(preço, desconto):
    resp = preço * desconto / 100
    return resp

def calc_pagar(preço, valordedesconto):
    resul = preço - valordedesconto
    return resul