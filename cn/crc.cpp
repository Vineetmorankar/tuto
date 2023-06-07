#include <iostream>
using namespace std;

int main()
{
	int i, j, k, l;
	int fs;
	cout << "Enter frame size: ";
	cin >> fs;

	int f[20];
	cout << "Enter Frame: ";
	for (int i = 0; i < fs; i++)
	{
		cin >> f[i];
	}

	int gs;
	cout << "Enter generator size: ";
	cin >> gs;

	int g[20];
	cout << "generator: ";
	for (int i = 0; i < gs; i++)
	{
		cin >> g[i];
	}

	cout << "\nEntered frame is: ";
	for (int i = 0; i < fs; i++)
	{
		cout << f[i];
	}

	cout << "\nEntered generator is: ";
	for (int i = 0; i < gs; i++)
	{
		cout << g[i];
	}

	// append
	int rs = gs - 1;
	cout << "\nNo of zeros to be appended:" << rs;

	for (i = fs; i < fs + rs; i++)
	{
		f[i] = 0;
	}

	int temp[20];
	for (i = 0; i < fs + rs; i++)
	{
		temp[i] = f[i];
	}

	cout << "\nmessage with appended zeros: ";
	for (i = 0; i < fs + rs; i++)
	{
		cout << temp[i];
	}

	//    division

	for (int i = 0; i < fs; i++)
	{
		j = 0;
		k = i;
		if (temp[k] >= g[j])
		{
			for (int j = 0, k = i; j < gs; j++, k++)
			{
				if ((temp[k] == 1 && g[j] == 1) || (temp[k] == 0 && g[j] == 0))
				{
					temp[k] = 0;
				}
				else
				{
					temp[k] = 1;
				}
			}
		}
	}

	// crc
	int crc[15];
	for (int i = 0, j = fs; i < rs; i++, j++)
	{
		crc[i] = temp[j];
	}
	cout << "\nCrc is: ";
	for (int i = 0; i < rs; i++)
	{
		cout << crc[i];
	}

	int tf[20];
	for (int i = 0; i < fs; i++)
	{
		tf[i] = f[i];
	}
	for (int i = 0, j = fs; i < rs; i++, j++)
	{
		tf[j] = crc[i];
	}
	cout << "\n Transmitting frame : ";
	for (int i = 0; i < fs + rs; i++)
	{
		cout << tf[i];
	}
	// receiver
	cout << "\nReceiver Side:";
	cout << "Received frame is: ";
	for (int i = 0; i < fs + rs; i++)
	{
		cout << tf[i];
	}
	for (int i = 0; i < fs + rs; i++)
	{
		temp[i] = tf[i];
	}

	for (int i = 0; i < fs + rs; i++)
	{
		j = 0;
		k = i;
		if (temp[k] >= g[j])
		{
			for (j = 0, k = i; j < gs; j++, k++)
			{
				if ((temp[k] == 1 && g[j] == 1) || (temp[k] == 0 && g[j] == 0))
				{
					temp[k] = 0;
				}
				else
				{
					temp[k] = 1;
				}
			}
		}
	}

	int rrem[15];
	for (int i = 0, j = fs; i < rs; i++, j++)
	{
		rrem[i] = temp[j];
	}
	cout << "\nRemainder is:";
	for (int i = 0; i < rs; i++)
	{
		cout << rrem[i];
	}

	int flag = 0;
	for (int i = 0; i < rs; i++)
	{
		if (rrem[i] != 0)
		{
			flag = 1;
		}
	}
	if (flag == 0)
	{
		cout << "\nreceived succesfully";
	}
	else
	{
		cout << "\nerror;";
	}
	return 0;
}
