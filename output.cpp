#include <iostream>
#include <string>
using namespace std;

const float TAX_RATE = 0.15;
float getPrice(int code) {
    float price = 0.0;
        switch (code) {
        case 1:
            price = 2.50;
            break;
        case 2:
            price = 4.00;
            break;
        case 3:
            price = 6.75;
            break;
        default:
            price = 0.0;
            break;
    }
    return price;
}

class Register{
    public:
        void addItem(float price)
        {
            this->subtotal += price;
        }
        void calculateTaxes()
        {
            this->taxes = this->subtotal * TAX_RATE;
        }
        void calculateTotal()
        {
            this->total = this->subtotal + this->taxes;
        }
        float getSubtotal()
        {
            return this->subtotal;
        }
        float getTaxes()
        {
            return this->taxes;
        }
        float getTotal()
        {
            return this->total;
        }
        void reset()
        {
            this->subtotal = 0.0;
            this->taxes = 0.0;
            this->total = 0.0;
        }
    private:
        float subtotal = 0.0;
        float taxes = 0.0;
        float total = 0.0;
};

int main() {
    int itemCount = 0;
    int product = 0;
    Register cash;
    cout << "=== TIENDA RÁPIDA ===" << endl;
    cout << "1. Pan ($2.50)" << endl;
    cout << "2. Leche ($4.00)" << endl;
    cout << "3. Queso ($6.75)" << endl;
    cout << "" << endl;
        while (itemCount < 3) {
        cout << "Producto (1-3) o 0 para pagar:" << endl;
        cin >> product;
            if (product == 0) {
        itemCount = 3;
    } else {
            if (product >= 1 and product <= 3) {
        float itemPrice = getPrice(product);
        cash.addItem(itemPrice);
        itemCount += 1;
        cout << "Agregado: $" << itemPrice << endl;
    } else {
        cout << "Producto inválido" << endl;
    }
    }
    }
        if (itemCount > 0) {
        cash.calculateTaxes();
        cash.calculateTotal();
        cout << "===============" << endl;
        cout << "=== FACTURA ===" << endl;
        cout << "===============" << endl;
        cout << "Subtotal: $" << cash.getSubtotal() << endl;
        cout << "Impuestos (15%): $" << cash.getTaxes() << endl;
        cout << "TOTAL: $" << cash.getTotal() << endl;
        float payment = 0.0;
        float finalTotal = cash.getTotal();
            do {
        cout << "Ingrese pago:" << endl;
        cin >> payment;
            if (payment >= finalTotal) {
        float change = payment - finalTotal;
        cout << "Pago: $" << payment << endl;
        cout << "Cambio: $" << change << endl;
        cout << "¡Gracias por su compra!" << endl;
    } else {
        cout << "Insuficiente. Necesita: $" << finalTotal << endl;
    }
    } while (payment < finalTotal);
    } else {
        cout << "Sin compras realizadas" << endl;
    }
    return 0;
}
