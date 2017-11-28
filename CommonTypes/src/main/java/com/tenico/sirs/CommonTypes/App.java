package com.tenico.sirs.CommonTypes;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.UUID;

//Remote App Pattern

public interface App extends Remote
{
	String getLoggedClinicianName() throws RemoteException;
    void logout() throws RemoteException;
    void listAppointments() throws RemoteException;
    void listRecords(UUID patient_id) throws RemoteException;
}